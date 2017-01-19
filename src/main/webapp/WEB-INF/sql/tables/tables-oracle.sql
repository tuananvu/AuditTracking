create table AuditCheckItem (
	CheckItemId number(30,0) not null primary key,
	CheckItemName VARCHAR2(75 CHAR) null,
	Question VARCHAR2(75 CHAR) null,
	Answer VARCHAR2(75 CHAR) null,
	Complie number(1, 0),
	Evidence VARCHAR2(75 CHAR) null,
	Outcome VARCHAR2(75 CHAR) null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null,
	AuditId number(30,0)
);

create table AuditFinding (
	FindingId number(30,0) not null primary key,
	FindingName VARCHAR2(75 CHAR) null,
	PlanId number(30,0),
	Type VARCHAR2(75 CHAR) null,
	DueDate timestamp null,
	Status VARCHAR2(75 CHAR) null,
	FollowupDue timestamp null,
	FollowupStatus VARCHAR2(75 CHAR) null,
	Note VARCHAR2(75 CHAR) null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null
);

create table AuditPlan (
	PlanId number(30,0) not null primary key,
	PlanName VARCHAR2(75 CHAR) null,
	InitAuditId number(30,0),
	Auditor VARCHAR2(75 CHAR) null,
	AuditTeam VARCHAR2(75 CHAR) null,
	Interviewes VARCHAR2(75 CHAR) null,
	PlanDate timestamp null,
	ActDate timestamp null,
	Status VARCHAR2(75 CHAR) null,
	Note VARCHAR2(75 CHAR) null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null
);

create table AuditReport (
	AuditId number(30,0) not null primary key,
	AuditName VARCHAR2(75 CHAR) null,
	InitAuditId number(30,0),
	Auditor VARCHAR2(75 CHAR) null,
	Note VARCHAR2(75 CHAR) null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null
);

create table CorrectiveAction (
	ActionId number(30,0) not null primary key,
	ActionName VARCHAR2(75 CHAR) null,
	FindingId number(30,0),
	Note VARCHAR2(75 CHAR) null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null
);

create table InitAudit (
	InitAuditId number(30,0) not null primary key,
	InitAuditName VARCHAR2(75 CHAR) null,
	StartDate timestamp null,
	EndDate timestamp null,
	companyId number(30,0),
	groupId number(30,0),
	userId number(30,0),
	createDate timestamp null,
	modifiedDate timestamp null
);
