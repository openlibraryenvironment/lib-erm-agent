import groovy.grape.Grape

@GrabResolver(name='mvnRepository', root='http://central.maven.org/maven2/')
@GrabResolver(name='kint', root='http://nexus.k-int.com/content/repositories/releases')
@Grab('io.github.http-builder-ng:http-builder-ng-core:1.0.4')
@Grab('commons-codec:commons-codec:1.14')
@Grab('org.ini4j:ini4j:0.5.4')
@Grab('net.sf.opencsv:opencsv:2.3')



import org.ini4j.*;
import groovy.json.JsonOutput;


public class AgentMain {

  public static void process(String[] args) {
    if ( args.length < 1 ) {
      println("usage: AgentMain.groovy cfg_name");
      system.exit(1);
    }
    else {
      println("Process config ${args[0]}");
    }

    String cfg=args[0]

    Wini ini = new Wini(new File(System.getProperty("user.home")+'/.folio/config'));

    String folioURL = ini.get(laser_cfg, 'folioURL', String.class)
    String folioTenant = ini.get(laser_cfg, 'folioTenant', String.class)
    String folioUser = ini.get(laser_cfg, 'folioUser', String.class)
    String folioPass = ini.get(laser_cfg, 'folioPass', String.class)
  }
}

