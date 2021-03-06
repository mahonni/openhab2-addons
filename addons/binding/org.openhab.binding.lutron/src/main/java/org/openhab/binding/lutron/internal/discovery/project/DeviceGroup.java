/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lutron.internal.discovery.project;

import java.util.Collections;
import java.util.List;

/**
 * A group of input devices in the Lutron system.
 *
 * @author Allan Tong - Initial contribution
 */
public class DeviceGroup implements DeviceNode {
    private String name;
    private List<Device> devices;

    public String getName() {
        return name;
    }

    public List<Device> getDevices() {
        return devices != null ? devices : Collections.<Device> emptyList();
    }
}
