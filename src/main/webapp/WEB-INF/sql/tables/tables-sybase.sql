create table AuditCheckItem (
	CheckItemId decimal(20,0) not null primary key,
	CheckItemName varchar(75) null,
	Question varchar(75) null,
	Answer varchar(75) null,
	Complie int,
	Evidence varchar(75) null,
	Outcome varchar(75) null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null,
	AuditId decimal(20,0)
)
go

create table AuditFinding (
	FindingId decimal(20,0) not null primary key,
	FindingName varchar(75) null,
	PlanId decimal(20,0),
	Type varchar(75) null,
	DueDate datetime null,
	Status varchar(75) null,
	FollowupDue datetime null,
	FollowupStatus varchar(75) null,
	Note varchar(75) null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null
)
go

create table AuditPlan (
	PlanId decimal(20,0) not null primary key,
	PlanName varchar(75) null,
	InitAuditId decimal(20,0),
	Auditor varchar(75) null,
	AuditTeam varchar(75) null,
	Interviewes varchar(75) null,
	PlanDate datetime null,
	ActDate datetime null,
	Status varchar(75) null,
	Note varchar(75) null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null
)
go

create table AuditReport (
	AuditId decimal(20,0) not null primary key,
	AuditName varchar(75) null,
	InitAuditId decimal(20,0),
	Auditor varchar(75) null,
	Note varchar(75) null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null
)
go

create table CorrectiveAction (
	ActionId decimal(20,0) not null primary key,
	ActionName varchar(75) null,
	FindingId decimal(20,0),
	Note varchar(75) null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null
)
go

create table InitAudit (
	InitAuditId decimal(20,0) not null primary key,
	InitAuditName varchar(75) null,
	StartDate datetime null,
	EndDate datetime null,
	companyId decimal(20,0),
	groupId decimal(20,0),
	userId decimal(20,0),
	createDate datetime null,
	modifiedDate datetime null
)
go
