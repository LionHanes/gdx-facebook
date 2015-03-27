package de.tpronold.gdxfacebook.desktop;

public interface DesktopFacebookGUI {
	public void show(FacebookLoginListener listener);

	public void setAppId(String appId);

	public String getAppId();

	public String getPermissions();

	public void setPermissions(String permissions);
}
