var vusuariologeado = {}; 
var vcorreo= "";
var vpassword= "";
//--------------------
//Document.ready-------------
$( document ).ready( function() {
//console.log("hola");


//Login -----------------------------------
$("#idlogin").on("click",function(e) {
    e.preventDefault();
    vcorreo= document.getElementById("correo").value
    vpassword= document.getElementById("password").value
   var vurl= '/login/'+vcorreo+'/'+vpassword;
    console.log("variable: "+vcorreo);
    console.log("variable: "+vpassword);
    console.log("variable: "+vurl);
    var loglogin={
        correo:$('input[name="correo"]').val(),
        password:$('input[name="password"]').val()
    }
		console.log("si entra login")
    $.ajax({
        url: vurl, //uri
        type: 'POST',
        data: JSON.stringify(loglogin), // or JSON.stringify ({name: 'jonas'}),
        beforeSend: function (xhr) {
            //xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
            
            
        },
        success: function(data) { 
            if(data.correo == vcorreo && data.password == vpassword){
                //GUARDAR USUARIO ACTIVO
                vusuariologeado=data;
                //idLogeado=log.id
                
                alert('{login}SI Agrego: ' + vusuariologeado.correo+" "+data.password);
                location.href ="/html/propiedades.html";
                
                //alert('Se Agrego: ' + data+ " "+ idLogeado);
            
        }else{alert('{login}No Agrego: ' + data);}
            
         },
        contentType: "application/json",
        dataType: 'json'
        
    });
    //Login------------------------------
  
})

//Login ------------------------------------------------
//Propiedades-------------------------------------------
$( window ).on( "load", function() { 
    $('#iddueno').append(vcorreo)   
    //mostrar propiedades
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
           console.log(vcorreo);
      }    
  );
  //mostrar propiedades

 })

//Propiedades-------------------------------------------

  })
//Document.ready-------------

//document.load---------------------------------------------
/*
$( window ).on( "load", function() { 
    
    //mostrar propiedades
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
           console.log(vcorreo);
      }    
  );
  //mostrar propiedades

 // document.getElementById("iddueno").innerHTML="alex";
 $('#iddueno').append(vcorreo)
 })
*/
