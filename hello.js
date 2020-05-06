$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8083/"
    }).then(function(data) {
       $('.word-text').append(data.text);
    });
});