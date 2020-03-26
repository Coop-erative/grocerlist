     $(document).ready(function(){
      var i=1;
     $("#add_row").click(function(){
      $('#addr'+i).html("<td>"+ (i+1) +"</td><td><input name='name"+i+"' type='text' placeholder='Name' class='form-control input-md'  /> </td>
      <td><input  name='amount"+i+"' type='text' placeholder='Amount'  class='form-control input-md'></td>
      <td>                            <select name="type0" class="form-control">
                                          <option th:each="ingredient : ${ingredients}"
                                                  th:text="${ingredient.measurementType}"
                                                  th:value="${ingredient.id}"></option>
                                      </select></td>");

      $('#tab_logic').append('<tr id="addr'+(i+1)+'"></tr>');
      i++;
  });
     $("#delete_row").click(function(){
    	 if(i>1){
		 $("#addr"+(i-1)).html('');
		 i--;
		 }
	 });

});