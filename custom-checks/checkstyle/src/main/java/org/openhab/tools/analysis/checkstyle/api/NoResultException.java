/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.tools.analysis.checkstyle.api;

/**
 * Exception that indicates that a line number was not found in a file
 *
 * @author Svilen Valkanov - Initial contribution
 */
public class NoResultException extends Exception {

    public NoResultException(String message) {
        super(message);
    }

    public NoResultException() {
        // super constructor call
    }
}
