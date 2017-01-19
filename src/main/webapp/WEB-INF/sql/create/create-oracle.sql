drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

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



quit