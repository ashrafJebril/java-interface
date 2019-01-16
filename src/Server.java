public interface Server {

    public void start();
    public void stop();
    public boolean checkConnection();
    public boolean getConnected();
    public boolean getDisconnected();
    public String parseXML(String url);
    public String parseJSON(String url);
    public String downloadPageContent(String url);

}
