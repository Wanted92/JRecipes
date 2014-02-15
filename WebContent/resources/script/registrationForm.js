/**
 * 
 */
function checkPass(){
	$(document).ready(function(){
		$("#password2").keyup(function(){
			if($('#password2').val() != $('#password').val()){
				$('#alertPasswordMismatch').html('The confirm password mismatch.').addClass('error');
				$('input[type="submit"]').attr('disabled','disabled');
			}else{
				$('#alertPasswordMismatch').html('');
				$('input[type="submit"]').removeAttr('disabled');
			}
		});
		
		$("#password").keyup(function(){
			if($('#password').val() != $('#password2').val()){
				$('#alertPasswordMismatch').html('The confirm password mismatch.').addClass('error');
				$('input[type="submit"]').attr('disabled','disabled');
			}else{
				$('#alertPasswordMismatch').html('');
				$('input[type="submit"]').removeAttr('disabled');
			}
		});
	});
};