drop database lportal;
create database lportal;

go

use lportal;

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


