<!doctype html>
<html lang="en">

	<head>
	  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" type="text/css">
	  <title>Employee Dashboard</title>
	  <!-- Required meta tags -->
	  <meta charset="utf-8">
	  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	  <!--     Fonts and icons     -->
	  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
	  <link rel="stylesheet" href="../assets/css/fontawesome.min.css">
	  <!-- Material Kit CSS -->
	  <link href="../assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet"/>
	  <!-- own CSS -->
	  
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	
	  <meta charset="utf-8" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	  <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
	</head>
	<body>
		<!--courseware and assignment content -->
			<br></br>
	<div class="card card-nav-tabs">
			<div class="card-header card-header-primary">
			<h4 class="text-center" style="font-size:30px">Courseware and Assignment
			<!--<td><input type="button" id="btnback" class="text-left" value="Back" style="float:left;height:50px">
			</input></td>-->
			<i class="material-icons" style="float:right;height:100%;
			font-size:40px;position:relative;margin-left:1120px;margin-top:-40px;">help_center</i></h4>
			</div>
		<div style="margin-left:1%;margin-right:1%">
		<div class="card-body" style="width:100%"><br>
		<h5 style="margin-left:0%;font-size:18px;margin-top:5px">Batch Name </h5>
			<table class="table" style="background-color:white">
						<thead>
						<tr>
							<th class="text-center"></th>
							<th style="font-size:18px">Name</th>
							<th style="font-size:18px">Fees Status</th>
							<th style="font-size:18px">Courseware</th>
							<th style="font-size:18px">Assignment Issued</th>
							<th style="font-size:18px">Assignment Submitted</th>
						</tr>
						</thead>
				<tbody>
					<tr>
						<td class="text-center" style="width:200px height:200px"></td>
						<td style="font-size:15px width:200px height:200px">Abc</td>
						<td style="font-size:15px width:200px height:200px">paid</td>
						<td style="font-size:15px width:200px height:200px">java</td>
						<td style="font-size:15px width:200px height:200px">yes</td>
				        <td class="td-actions" style="width:200px height:200px">no</td>
					</tr>
					<tr>
						<td class="text-center" style="width:200px height:200px"></td>
						<td style="font-size:15px width:200px height:200px">pqr</td>
						<td style="font-size:15px width:200px height:200px">not paid</td>
						<td style="font-size:15px width:200px height:200px">c++</td>
						<td style="font-size:15px width:200px height:200px">no</td>
				        <td class="td-actions" style="width:200px height:200px">yes</td>
					</tr>
					<tr>
						<td class="text-center" style="width:200px height:200px"></td>
						<td style="font-size:15px width:200px height:200px">aaa</td>
						<td style="font-size:15px width:200px height:200px">c#</td>
						<td style="font-size:15px width:200px height:200px">paid</td>
						<td style="font-size:15px width:200px height:200px">yes</td>
				        <td class="td-actions" style="width:200px height:200px">no</td>
					</tr>
					<tr>
						<td class="text-center" style="width:200px height:200px"></td>
						<td style="font-size:15px width:200px height:200px">axz</td>
						<td style="font-size:15px width:200px height:200px">html</td>
						<td style="font-size:15px width:200px height:200px">not paid</td>
						<td style="font-size:15px width:200px height:200px">yes</td>
				        <td class="td-actions" style="width:200px height:200px">yes</td>
					</tr>
					<tr>
						<td ></td>
						<td ></td>
						<td ></td>
						<td ></td>
						<td ></td>
				        <td ></td>
					</tr>
				
				</tbody>
			</table>
		</div>
	</div>
	</div>
		<!--courseware and assignment content end-->
		
		<!--batch add student content -->
		<!--<div class="container-fluid" id="batch-add-student">
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="margin-left:42%">Courseware and Assignment</h3>
				</div><br>
			</div>
			
			<div class="card">
				<div class="card-body">
				  <div class="table-responsive" id="table-batch-add-student">
					
				  </div>
			    </div>
			</div><br>
			<button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#mymodal_email">Email</button>
			
		</div>-->
		<!-- batch add student content end -->
		
		<!--email modal start-->
		<div class="modal fade" id="mymodal_email" >
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h2 id="modal-title" class="modal-title" tabindex="0" style="color:purple">Email</h2>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<label>Subject:</label>
						<input class="form-control" type="text" value="Launch of a new batch for the computer network course"/><br><br>
						
						<label>Message:</label>
						<textarea class="form-control" rows=3 type="text">Hello, New Computer Network Batch is going to start form 2020-12-23</textarea><br><br>
						<button type="button" class="btn btn-primary" data-dismiss="modal" >SEND</button>
					</div>						 
				</div>
			</div>
		</div>
		<!--email modal end-->
		
	    <!--   Core JS Files   -->
		<script src="../assets/js/core/jquery.min.js"></script>
		<script src="../assets/js/core/popper.min.js"></script>
		<script src="../assets/js/core/bootstrap-material-design.min.js"></script>
		<script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
		<!-- Plugin for the momentJs  -->
		<script src="../assets/js/plugins/moment.min.js"></script>
		<!--  Plugin for Sweet Alert -->
		<script src="../assets/js/plugins/sweetalert2.js"></script>
		<!-- Forms Validations Plugin -->
		<script src="../assets/js/plugins/jquery.validate.min.js"></script>
		<!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
		<script src="../assets/js/plugins/jquery.bootstrap-wizard.js"></script>
		<!--	Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
		<script src="../assets/js/plugins/bootstrap-selectpicker.js"></script>
		<!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
		<script src="../assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
		<!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
		<script src="../assets/js/plugins/jquery.dataTables.min.js"></script>
		<!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
		<script src="../assets/js/plugins/bootstrap-tagsinput.js"></script>
		<!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
		<script src="../assets/js/plugins/jasny-bootstrap.min.js"></script>
		<!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
		<script src="../assets/js/plugins/fullcalendar.min.js"></script>
		<!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
		<script src="../assets/js/plugins/jquery-jvectormap.js"></script>
		<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
		<script src="../assets/js/plugins/nouislider.min.js"></script>
		<!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
		<!-- Library for adding dinamically elements -->
		<script src="../assets/js/plugins/arrive.min.js"></script>
		<!--  Google Maps Plugin    -->
		<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
		<!-- Chartist JS -->
		<script src="../assets/js/plugins/chartist.min.js"></script>
		<!--  Notifications Plugin    -->
		<script src="../assets/js/plugins/bootstrap-notify.js"></script>
		<!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
		<script src="../assets/js/material-dashboard.js?v=2.1.1" type="text/javascript"></script>
		<!-- Material Dashboard DEMO methods, don't include it in your project! -->
		<script src="../assets/demo/demo.js"></script>
		
		<script>
			
			var addStudentList=[
			{
				student:"Pragya Korpal",
				registered:"true",
				time:"Morning",
				startDate:"2020-10-30"
				
			},
			{
				student:"Abhishek Dixit",
				registered:"true",
				time:"Evening",
				startDate:"2020-10-30"
				
			},
			{
				student:"Surbhi Joshi",
				registered:"false",
				time:"Morning",
				startDate:"2020-10-30"
				
			}
			]
			
			var elem = document.getElementById('details-batch');
			if(elem!=null){
				elem.parentNode.removeChild(elem);
			}
			
			var table = document.createElement('table');
			table.className="table table-hover";
			table.id="details-batch";
			var thead = document.createElement('thead');
			
			var th1 = document.createElement('th');
			th1.textContent = "Name";
			var th2 = document.createElement('th');
			th2.textContent = "Fees Status";
			var th3 = document.createElement('th');
			th3.textContent = "Courseware";
			var th4 = document.createElement('th');
			th4.textContent = "Assignment Issued ";
			var th5 = document.createElement('th');
			th5.textContent = "Assignment Submitted ";
					
			thead.appendChild(th1);
			thead.appendChild(th2);
			thead.appendChild(th4);
			thead.appendChild(th3);
			
			table.appendChild(thead);
			
			var tbody = document.createElement('tbody');
			
			for(var i=0;i<addStudentList.length;i++){
				
				var tr = document.createElement('tr');
				var td1 = document.createElement('td');
				td1.textContent = addStudentList[i].student;
				var td2 = document.createElement('td');
				td2.textContent = addStudentList[i].registered;
				var td3 = document.createElement('td');
				td3.textContent = addStudentList[i].time;
				var td4 = document.createElement('td');
				td4.textContent = addStudentList[i].startDate;
				
				tr.appendChild(td1);
				tr.appendChild(td2);
				
				tr.appendChild(td4);
				tr.appendChild(td3);
				
				tbody.appendChild(tr);
			}
			table.appendChild(tbody);
			
			document.getElementById('table-batch-add-student').appendChild(table);
		</script>
	</body>
</html>	