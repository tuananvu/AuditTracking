package syneren.qms.audit.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;
import syneren.qms.audit.service.AuditFindingLocalServiceUtil;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;
import syneren.qms.audit.service.AuditReportLocalServiceUtil;
import syneren.qms.audit.service.ClpSerializer;
import syneren.qms.audit.service.CorrectiveActionLocalServiceUtil;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AuditCheckItemLocalServiceUtil.clearService();

            AuditFindingLocalServiceUtil.clearService();

            AuditPlanLocalServiceUtil.clearService();

            AuditReportLocalServiceUtil.clearService();

            CorrectiveActionLocalServiceUtil.clearService();

            InitAuditLocalServiceUtil.clearService();
        }
    }
}
