package org.opendaylight.controller.virtualNetworkManager;

import org.opendaylight.controller.protocol_plugin.openflow13.core.IMessageListener;
import org.opendaylight.controller.protocol_plugin.openflow13.core.ISwitch;
import org.opendaylight.controller.sal.flowprogrammer.IFlowProgrammerService;
import org.opendaylight.controller.sal.packet.IDataPacketService;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.openflow.protocol.OFMessage;

public class OFEventManager{

	private IFlowProgrammerService programmer = null;
	private IDataPacketService dataPacketService = null;
	private ISwitchManager switchManager = null;

	public void setFlowProgrammerService(IFlowProgrammerService s){
        this.programmer = s;
    }
	
	void setDataPacketService(IDataPacketService s) {
        this.dataPacketService = s;
    }

	public void setSwitchManager(ISwitchManager switchManager2) {
		// TODO Auto-generated method stub
		
	}

	public void registerHandler(VirtualNetworkManager virtualNetworkManager) {
		// TODO Auto-generated method stub
		
	}
}
