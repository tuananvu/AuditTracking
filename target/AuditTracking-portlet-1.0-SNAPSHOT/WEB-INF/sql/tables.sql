create table AuditCheckItem (
	CheckItemId LONG not null primary key,
	CheckItemName VARCHAR(75) null,
	Question VARCHAR(75) null,
	Answer VARCHAR(75) null,
	Complie BOOLEAN,
	Evidence VARCHAR(75) null,
	Outcome VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	AuditId LONG
);

create table AuditFinding (
	FindingId LONG not null primary key,
	FindingName VARCHAR(75) null,
	PlanId LONG,
	Type VARCHAR(75) null,
	DueDate DATE null,
	Status VARCHAR(75) null,
	FollowupDue DATE null,
	FollowupStatus VARCHAR(75) null,
	Note VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table AuditPlan (
	PlanId LONG not null primary key,
	PlanName VARCHAR(75) null,
	InitAuditId LONG,
	Auditor VARCHAR(75) null,
	AuditTeam VARCHAR(75) null,
	Interviewes VARCHAR(75) null,
	PlanDate DATE null,
	ActDate DATE null,
	Status VARCHAR(75) null,
	Note VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table AuditReport (
	AuditId LONG not null primary key,
	AuditName VARCHAR(75) null,
	InitAuditId LONG,
	Auditor VARCHAR(75) null,
	Note VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table CorrectiveAction (
	ActionId LONG not null primary key,
	ActionName VARCHAR(75) null,
	FindingId LONG,
	Note VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table InitAudit (
	InitAuditId LONG not null primary key,
	InitAuditName VARCHAR(75) null,
	StartDate DATE null,
	EndDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);