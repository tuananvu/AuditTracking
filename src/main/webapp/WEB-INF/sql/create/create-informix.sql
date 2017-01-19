database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;


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


