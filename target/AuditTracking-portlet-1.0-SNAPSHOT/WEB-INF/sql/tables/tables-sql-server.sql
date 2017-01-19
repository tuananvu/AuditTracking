create table AuditCheckItem (
	CheckItemId bigint not null primary key,
	CheckItemName nvarchar(75) null,
	Question nvarchar(75) null,
	Answer nvarchar(75) null,
	Complie bit,
	Evidence nvarchar(75) null,
	Outcome nvarchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null,
	AuditId bigint
);

create table AuditFinding (
	FindingId bigint not null primary key,
	FindingName nvarchar(75) null,
	PlanId bigint,
	Type nvarchar(75) null,
	DueDate datetime null,
	Status nvarchar(75) null,
	FollowupDue datetime null,
	FollowupStatus nvarchar(75) null,
	Note nvarchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
);

create table AuditPlan (
	PlanId bigint not null primary key,
	PlanName nvarchar(75) null,
	InitAuditId bigint,
	Auditor nvarchar(75) null,
	AuditTeam nvarchar(75) null,
	Interviewes nvarchar(75) null,
	PlanDate datetime null,
	ActDate datetime null,
	Status nvarchar(75) null,
	Note nvarchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
);

create table AuditReport (
	AuditId bigint not null primary key,
	AuditName nvarchar(75) null,
	InitAuditId bigint,
	Auditor nvarchar(75) null,
	Note nvarchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
);

create table CorrectiveAction (
	ActionId bigint not null primary key,
	ActionName nvarchar(75) null,
	FindingId bigint,
	Note nvarchar(75) null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
);

create table InitAudit (
	InitAuditId bigint not null primary key,
	InitAuditName nvarchar(75) null,
	StartDate datetime null,
	EndDate datetime null,
	companyId bigint,
	groupId bigint,
	userId bigint,
	createDate datetime null,
	modifiedDate datetime null
);
