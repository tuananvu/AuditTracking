create table AuditCheckItem (
	CheckItemId bigint not null primary key,
	CheckItemName varchar(75),
	Question varchar(75),
	Answer varchar(75),
	Complie smallint,
	Evidence varchar(75),
	Outcome varchar(75),
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp,
	AuditId bigint
);

create table AuditFinding (
	FindingId bigint not null primary key,
	FindingName varchar(75),
	PlanId bigint,
	Type varchar(75),
	DueDate timestamp,
	Status varchar(75),
	FollowupDue timestamp,
	FollowupStatus varchar(75),
	Note varchar(75),
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp
);

create table AuditPlan (
	PlanId bigint not null primary key,
	PlanName varchar(75),
	InitAuditId bigint,
	Auditor varchar(75),
	AuditTeam varchar(75),
	Interviewes varchar(75),
	PlanDate timestamp,
	ActDate timestamp,
	Status varchar(75),
	Note varchar(75),
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp
);

create table AuditReport (
	AuditId bigint not null primary key,
	AuditName varchar(75),
	InitAuditId bigint,
	Auditor varchar(75),
	Note varchar(75),
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp
);

create table CorrectiveAction (
	ActionId bigint not null primary key,
	ActionName varchar(75),
	FindingId bigint,
	Note varchar(75),
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp
);

create table InitAudit (
	InitAuditId bigint not null primary key,
	InitAuditName varchar(75),
	StartDate timestamp,
	EndDate timestamp,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate timestamp,
	modifiedDate timestamp
);
