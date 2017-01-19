/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package syneren.qms.audit;

import com.liferay.portal.NoSuchModelException;

/**
 * @author anguyen
 */
public class NoSuchInitAuditException extends NoSuchModelException {

	public NoSuchInitAuditException() {
		super();
	}

	public NoSuchInitAuditException(String msg) {
		super(msg);
	}

	public NoSuchInitAuditException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchInitAuditException(Throwable cause) {
		super(cause);
	}

}