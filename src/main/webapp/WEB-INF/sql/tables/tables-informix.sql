create table AuditCheckItem (
	CheckItemId int8 not null primary key,
	CheckItemName varchar(75),
	Question varchar(75),
	Answer varchar(75),
	Complie boolean,
	Evidence varchar(75),
	Outcome varchar(75),
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	AuditId int8
)
extent size 16 next size 16
lock mode row;

create table AuditFinding (
	FindingId int8 not null primary key,
	FindingName varchar(75),
	PlanId int8,
	Type varchar(75),
	DueDate datetime YEAR TO FRACTION,
	Status varchar(75),
	FollowupDue datetime YEAR TO FRACTION,
	FollowupStatus varchar(75),
	Note varchar(75),
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;

create table AuditPlan (
	PlanId int8 not null primary key,
	PlanName varchar(75),
	InitAuditId int8,
	Auditor varchar(75),
	AuditTeam varchar(75),
	Interviewes varchar(75),
	PlanDate datetime YEAR TO FRACTION,
	ActDate datetime YEAR TO FRACTION,
	Status varchar(75),
	Note varchar(75),
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;

create table AuditReport (
	AuditId int8 not null primary key,
	AuditName varchar(75),
	InitAuditId int8,
	Auditor varchar(75),
	Note varchar(75),
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;

create table CorrectiveAction (
	ActionId int8 not null primary key,
	ActionName varchar(75),
	FindingId int8,
	Note varchar(75),
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;

create table InitAudit (
	InitAuditId int8 not null primary key,
	InitAuditName varchar(75),
	StartDate datetime YEAR TO FRACTION,
	EndDate datetime YEAR TO FRACTION,
	companyId int8,
	groupId int8,
	userId int8,
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;
