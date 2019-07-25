package me.neznamy.tab.shared;

import me.neznamy.tab.shared.packets.UniversalPacketPlayOut;

public interface MainClass {

	public void sendConsoleMessage(String message);
	public boolean listNames();
	public String getPermissionPlugin();
	public String getSeparatorType();
	public boolean isDisabled();
	public void reload(ITabPlayer sender);
	public Object createComponent(String text);
	public boolean killPacket(Object packetPlayOutScoreboardTeam) throws Exception;
	public Object toNMS(UniversalPacketPlayOut packet, int protocolVersion) throws Exception;
}