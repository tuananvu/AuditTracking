package syneren.qms.audit.service.base;

import syneren.qms.audit.service.InitAuditLocalServiceUtil;

import java.util.Arrays;

/**
 * @author anguyen
 * @generated
 */
public class InitAuditLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName58;
    private String[] _methodParameterTypes58;
    private String _methodName59;
    private String[] _methodParameterTypes59;
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;

    public InitAuditLocalServiceClpInvoker() {
        _methodName0 = "addInitAudit";

        _methodParameterTypes0 = new String[] {
                "syneren.qms.audit.model.InitAudit"
            };

        _methodName1 = "createInitAudit";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteInitAudit";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteInitAudit";

        _methodParameterTypes3 = new String[] {
                "syneren.qms.audit.model.InitAudit"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchInitAudit";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getInitAudit";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getInitAudits";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getInitAuditsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateInitAudit";

        _methodParameterTypes15 = new String[] {
                "syneren.qms.audit.model.InitAudit"
            };

        _methodName52 = "getBeanIdentifier";

        _methodParameterTypes52 = new String[] {  };

        _methodName53 = "setBeanIdentifier";

        _methodParameterTypes53 = new String[] { "java.lang.String" };

        _methodName58 = "getInitAudits";

        _methodParameterTypes58 = new String[] { "long" };

        _methodName59 = "getInitAudits";

        _methodParameterTypes59 = new String[] { "long", "int", "int" };

        _methodName60 = "addInitAudit";

        _methodParameterTypes60 = new String[] {
                "syneren.qms.audit.model.InitAudit", "long"
            };

        _methodName61 = "getFirstInitAuditByName";

        _methodParameterTypes61 = new String[] { "long", "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return InitAuditLocalServiceUtil.addInitAudit((syneren.qms.audit.model.InitAudit) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return InitAuditLocalServiceUtil.createInitAudit(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return InitAuditLocalServiceUtil.deleteInitAudit(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return InitAuditLocalServiceUtil.deleteInitAudit((syneren.qms.audit.model.InitAudit) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return InitAuditLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return InitAuditLocalServiceUtil.fetchInitAudit(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return InitAuditLocalServiceUtil.getInitAudit(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return InitAuditLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return InitAuditLocalServiceUtil.getInitAudits(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return InitAuditLocalServiceUtil.getInitAuditsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return InitAuditLocalServiceUtil.updateInitAudit((syneren.qms.audit.model.InitAudit) arguments[0]);
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return InitAuditLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            InitAuditLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName58.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
            return InitAuditLocalServiceUtil.getInitAudits(((Long) arguments[0]).longValue());
        }

        if (_methodName59.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
            return InitAuditLocalServiceUtil.getInitAudits(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return InitAuditLocalServiceUtil.addInitAudit((syneren.qms.audit.model.InitAudit) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            return InitAuditLocalServiceUtil.getFirstInitAuditByName(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        throw new UnsupportedOperationException();
    }
}
