
///////jQuery//////////////////////
$( document ).ready( function() {
  var url = "/propes";
  var data = {};
$.getJSON(url, data,
    function (data) {
        var template = '';
        data.forEach(element => {
            template += `
            	<h5 class="card-title">${element.nombre}</h5>
                <h5 class="card-title">${element.precio}</h5>
            `
            console.log(element.nombre)

         });  
         $("#api").append(template);     
    }    
);

 });
