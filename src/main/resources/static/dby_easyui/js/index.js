
$(function(){
	$("#nav").tree({
		 url:"getTree.do",
		 lines: true,
		 onClick:function(data){
			 if(data.nid!=0){
				 if($("#tabs").tabs("exists",data.text)){
					 $("#tabs").tabs("select",data.text);
				 }else{
					 $("#tabs").tabs("add",{
						 title:data.text,
						 closable:true,
						 href:data.url
					 });
				 }
			 }
		 }
		 
		 
		 
		 
	})	
})