import groovy.grape.Grape

@GrabResolver(name='mvnRepository', root='http://central.maven.org/maven2/')
@GrabResolver(name='kint', root='http://nexus.k-int.com/content/repositories/releases')
@Grab('io.github.http-builder-ng:http-builder-ng-core:1.0.4')
@Grab('commons-codec:commons-codec:1.14')
@Grab('org.ini4j:ini4j:0.5.4')
@Grab('net.sf.opencsv:opencsv:2.3')

import org.ini4j.*;
import groovy.json.JsonOutput;

if ( args.length == 0 ) {
  println("usage: demo.groovy {cfg_name}");
  system.exit(1);
}
else {
  println("Process config ${args[0]}");
}

// Replace with args[0]
// String laser_cfg='hbz'
String cfg=args[0]


FOLIOERMAgent.latestTitleChanges(cfg).each { erm_title ->
}
