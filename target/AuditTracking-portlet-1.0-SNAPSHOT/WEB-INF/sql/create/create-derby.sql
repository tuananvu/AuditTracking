drop database lportal;
create database lportal;
connect to lportal;
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


create index IX_953A4080 on AuditCheckItem (CheckItemId);
create index IX_965810E4 on AuditCheckItem (groupId);

create index IX_F0208900 on AuditFinding (FindingId);
create index IX_F4626396 on AuditFinding (groupId);

create index IX_DC99B02 on AuditPlan (PlanId);
create index IX_5F7A1FA0 on AuditPlan (groupId);

create index IX_E4024AB1 on AuditReport (AuditId);
create index IX_8AD9375 on AuditReport (groupId);

create index IX_6D7EF32F on CorrectiveAction (ActionId);
create index IX_7A6F9D00 on CorrectiveAction (groupId);

create index IX_A167AFC5 on InitAudit (InitAuditId);
create index IX_EB010A39 on InitAudit (groupId);


