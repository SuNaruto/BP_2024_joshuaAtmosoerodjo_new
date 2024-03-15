// Functie om uitleningen op te halen van de server
function fetchUitleningen() {
    fetch('http://localhost:8080/api/library/uitlening/all')
        .then(response => response.json())
        .then(data => displayUitleningen(data))
        .catch(error => console.error('Fout bij het ophalen van uitleningen:', error));
}

//// Functie om de tabel te vullen met uitleningen
function displayUitleningen(uitleningen) {
    var tableBody = $('#uitleningenTableBody');
    tableBody.empty(); // Leeg de tabel voordat je de uitleningen toevoegt

    uitleningen.forEach(function(uitlening) {
        var row = `<tr>
            <td>${uitlening.id}</td>
            <td>${uitlening.lid.naam}</td>
            <td>${uitlening.boek.titel}</td>
            <td>${uitlening.uitgeleendOp}</td>
            <td>${uitlening.teruggebrachtOp || ''}</td>
            <td>
                <button class="btn btn-warning btn-sm" onclick="editUitlening(${uitlening.id})">Edit</button>
                <button class="btn btn-danger btn-sm" onclick="deleteUitlening(${uitlening.id})">Delete</button>
            </td>
        </tr>`;
        tableBody.append(row);
    });
}

//// Functie om een uitlening te verwijderen
function deleteUitlening(uitleningID) {
    if(confirm('Weet je zeker dat je deze uitlening wilt verwijderen?')) {
        $.ajax({
            url: `http://localhost:8080/api/library/uitlening/delete/${uitleningID}`,
            method: 'DELETE',
            success: function() {
                showAlert('Uitlening succesvol verwijderd!', 'success');
                setTimeout(fetchUitleningen, 500); // Ververs de lijst na de verwijdering
            },
            error: function(xhr, status, error) {
                console.error('Fout bij het verwijderen van uitlening:', error);
                showAlert('Het verwijderen van de uitlening is mislukt. Probeer het opnieuw!', 'danger');
            }
        });
    }
}

//// Functie om een uitlening te bewerken
// Let op: Dit vereist aanvullende implementatie afhankelijk van hoe je formulier en modaal zijn opgezet
function editUitlening(uitleningID) {
    console.log('Bewerk uitlening:', uitleningID);
    // Implementeer modal opening en vulling hier...
}

//// Functie om uitleningwijzigingen op te slaan
function saveUitleningChanges(uitleningID) {
    // Implementeer opslaan van wijzigingen hier...
}

//// Functie om een nieuwe uitlening op te slaan
function saveUitlening() {
    // Verzamel de gegevens uit je formulier
var newData = {
    lid: {
        id: $('#createNaam').val() // Aannemende dat createNaam de ID van het lid bevat
    },
    boek: {
        id: $('#createBoek').val() // Aannemende dat createBoek de ID van het boek bevat
    },
    uitgeleendOp: $('#createUitlening').val(),
    teruggebrachtOp: $('#createTerug').val() // Optioneel, indien van toepassing
};

//
//    // Voer een AJAX POST-verzoek uit om de nieuwe uitlening op te slaan
    $.ajax({
        url: 'http://localhost:8080/api/library/uitlening/add',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(newData),
        success: function(data) {
            // Sluit de modal zodra de uitlening succesvol is opgeslagen
            $('#createUitleningModal').modal('hide');
            // Toon een succesmelding
            showAlert('Uitlening succesvol opgeslagen!', 'success');
            // Ververs de lijst met uitleningen om de nieuwe toevoeging weer te geven
            setTimeout(fetchUitleningen, 500);
        },
        error: function(xhr, status, error) {
            // Log de fout naar de console en toon een foutmelding
            console.error('Error:', error);
            showAlert('Het opslaan van de uitlening is mislukt. Probeer het opnieuw!', 'danger');
        }
    });
}


// Functie om alerts te tonen
function showAlert(message, type) {
    var alertPlaceholder = $('#alertPlaceholder');
    var alert = $(`<div class="alert alert-${type} alert-dismissible fade show" role="alert">${message}<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button></div>`);
    alertPlaceholder.append(alert);
    setTimeout(function() {
        alert.alert('close');
    }, 5000);
}

$(document).ready(function() {
    fetchUitleningen(); // Ververs de lijst bij het laden van de pagina
});





function fillDropdowns() {
    // Leden ophalen en opties toevoegen aan de naam dropdown
    fetch('http://localhost:8080/api/library/lid/all')
        .then(response => response.json())
        .then(data => {
            const naamSelect = document.getElementById('createNaam');
            // Verwijder bestaande opties
            naamSelect.innerHTML = '';
            data.forEach(lid => {
                let option = new Option(lid.naam, lid.id);
                naamSelect.add(option);
            });
        })
        .catch(error => console.log('Error bij het ophalen van leden:', error));

    // Boeken ophalen en opties toevoegen aan de boek dropdown
    fetch('http://localhost:8080/api/library/boek/all')
        .then(response => response.json())
        .then(data => {
            const boekSelect = document.getElementById('createBoek');
            // Verwijder bestaande opties
            boekSelect.innerHTML = '';
            data.forEach(boek => {
                let option = new Option(boek.titel, boek.id);
                boekSelect.add(option);
            });
        })
        .catch(error => console.log('Error bij het ophalen van boeken:', error));
}

// Roep deze functie aan wanneer de modal wordt getoond of wanneer de pagina laadt
$(document).ready(function() {
    fillDropdowns();
});

$('#createUitleningModal').on('show.bs.modal', fillDropdowns);
