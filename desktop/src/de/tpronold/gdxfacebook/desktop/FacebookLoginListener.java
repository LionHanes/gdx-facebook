package de.tpronold.gdxfacebook.desktop;

public interface FacebookLoginListener {
	public void onSuccess(String accessToken, long expires);

	public void onError(String error, String errorCode, String errorDescription, String errorReason);
}
