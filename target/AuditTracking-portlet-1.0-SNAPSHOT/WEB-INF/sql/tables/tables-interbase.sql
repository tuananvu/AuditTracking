create table AuditCheckItem (
	CheckItemId int64 not null primary key,
	CheckItemName varchar(75),
	Question varchar(75),
	Answer varchar(75),
	Complie smallint,
	Evidence varchar(75),
	Outcome varchar(75),
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp,
	AuditId int64
);

create table AuditFinding (
	FindingId int64 not null primary key,
	FindingName varchar(75),
	PlanId int64,
	Type varchar(75),
	DueDate timestamp,
	Status varchar(75),
	FollowupDue timestamp,
	FollowupStatus varchar(75),
	Note varchar(75),
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp
);

create table AuditPlan (
	PlanId int64 not null primary key,
	PlanName varchar(75),
	InitAuditId int64,
	Auditor varchar(75),
	AuditTeam varchar(75),
	Interviewes varchar(75),
	PlanDate timestamp,
	ActDate timestamp,
	Status varchar(75),
	Note varchar(75),
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp
);

create table AuditReport (
	AuditId int64 not null primary key,
	AuditName varchar(75),
	InitAuditId int64,
	Auditor varchar(75),
	Note varchar(75),
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp
);

create table CorrectiveAction (
	ActionId int64 not null primary key,
	ActionName varchar(75),
	FindingId int64,
	Note varchar(75),
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp
);

create table InitAudit (
	InitAuditId int64 not null primary key,
	InitAuditName varchar(75),
	StartDate timestamp,
	EndDate timestamp,
	companyId int64,
	groupId int64,
	userId int64,
	createDate timestamp,
	modifiedDate timestamp
);
