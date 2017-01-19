create table AuditCheckItem (
	CheckItemId bigint not null primary key,
	CheckItemName varchar(75) null,
	Question varchar(75) null,
	Answer varchar(75) null,
	Complie tinyint,
	Evidence varchar(75) null,
	Outcome varchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null,
	AuditId bigint
) engine InnoDB;

create table AuditFinding (
	FindingId bigint not null primary key,
	FindingName varchar(75) null,
	PlanId bigint,
	Type varchar(75) null,
	DueDate datetime null,
	Status varchar(75) null,
	FollowupDue datetime null,
	FollowupStatus varchar(75) null,
	Note varchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
) engine InnoDB;

create table AuditPlan (
	PlanId bigint not null primary key,
	PlanName varchar(75) null,
	InitAuditId bigint,
	Auditor varchar(75) null,
	AuditTeam varchar(75) null,
	Interviewes varchar(75) null,
	PlanDate datetime null,
	ActDate datetime null,
	Status varchar(75) null,
	Note varchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
) engine InnoDB;

create table AuditReport (
	AuditId bigint not null primary key,
	AuditName varchar(75) null,
	InitAuditId bigint,
	Auditor varchar(75) null,
	Note varchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
) engine InnoDB;

create table CorrectiveAction (
	ActionId bigint not null primary key,
	ActionName varchar(75) null,
	FindingId bigint,
	Note varchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
) engine InnoDB;

create table InitAudit (
	InitAuditId bigint not null primary key,
	InitAuditName varchar(75) null,
	StartDate datetime null,
	EndDate datetime null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
) engine InnoDB;
