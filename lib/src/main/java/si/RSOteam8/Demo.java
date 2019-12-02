package si.RSOteam8;

public class Demo {
    private final String[] clani = {"ec9381","sz6554"};
    private final String opis_projekta = "Nas projekt implementira aplikacijo za deljenje slik.";
    private final String[] mikrostoritve = {"http://34.82.65.81/v1/users","http://34.82.140.207/v1/images"};
    private final String[] github = {"https://github.com/teamSimeEdi/users", "https://github.com/teamSimeEdi/images"};
    private final String[] travis ={"https://travis-ci.org/teamSimeEdi/users","https://travis-ci.org/teamSimeEdi/images"};
    private final String[] dockerhub ={"https://hub.docker.com/r/rsoteam8/users","https://hub.docker.com/r/rsoteam8/images"};


    public String[] getClani() {
        return clani;
    }

    public String getOpis_projekta() {
        return opis_projekta;
    }

    public String[] getMikrostoritve() {
        return mikrostoritve;
    }

    public String[] getGithub() {
        return github;
    }

    public String[] getTravis() {
        return travis;
    }

    public String[] getDockerhub() {
        return dockerhub;
    }


}
