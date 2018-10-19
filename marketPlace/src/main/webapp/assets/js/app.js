$(function (){
	// Menú Activo
	switch(menu){
		case 'QuienesSomos':
			$('#quienesSomos').addClass('active');
			break;
			
		case 'Destinos':
			$('#destinos').addClass('active');
			break;
			
		case 'Contactenos':
			$('#contactenos').addClass('active');
			break;
			
		case 'Encuesta':
			$('#encuesta').addClass('active');
			break;
			
		//default:
			//$('#home').addClass('active');
			//break;
	}
});