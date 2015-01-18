function TodoListController($scope, $http) {
	$http.get('http://localhost:8080/todo').success(
		function(todolist) {
			$scope.todolist = todolist;
		}
	);
}