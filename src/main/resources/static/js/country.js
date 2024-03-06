$(document).ready(function() {
	
	console.log("loaded")
    $('table #editButton').on('click', function(event) {
        event.preventDefault();

        // /country/findById/?id=1
        var href = $(this).attr('href'); // this is the dynamic url it gives the attributes which button we are clicking.
        console.log(href)
        $.get(href, function(country, status) {
            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#continentEdit').val(country.continent);
            $('#nationalityEdit').val(country.nationality);
        });

        $('#editModal').modal();
    });
    
    $('table #deleteButton').on('click', function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href',href);
        
  		$('#deleteModal').modal();
    
    });

});




/*
$(document).ready(function() {
    $('table #editButton').click(function(event) {
        event.preventDefault(); // Prevent the default behavior of the anchor tag

        var url = $(this).attr('href'); // Get the URL from the href attribute of the clicked element
		console.log(url)
        // Make an AJAX request
        $.ajax({
            url: url,
            method: 'GET',
            success: function(response) {
                // Handle the successful response from the API
                console.log('API response:', response);
                country = response
                $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#continentEdit').val(country.continent);
            $('#nationalityEdit').val(country.nationality);
            $('#editModal').modal();
            },
            error: function(xhr, status, error) {
                // Handle errors
                console.error('Error:', error);
            }
        });
    });
});

*/