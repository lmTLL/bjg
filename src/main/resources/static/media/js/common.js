//参数说明：1 表单的id 2回调函数
function sub(id,cb) {
	$.ajax({
		url:$("#"+id).attr("action"),
		method:$("#"+id).attr("method"),
		data:$("#"+id).serialize(),
		success:cb
	})
}