// How to detect JavaFX runtime jar in sbt
// see http://stackoverflow.com/questions/14123749/how-to-detect-javafx-runtime-jar-in-sbt
javaHome := {
  var s = System.getenv("JAVA_HOME")
  if (s==null) {
    throw new RuntimeException( "No JDK found - try setting 'JAVA_HOME'." )
  }
  //
  val dir = new File(s)
  if (!dir.exists) {
    throw new RuntimeException( "'JAVA_HOME' Directory Not found :" + dir.getPath )
  }
  //
  Some(dir)  // 'sbt' 'javaHome' value is ': Option[java.io.File]'
}

unmanagedJars in Compile <+= javaHome map { jh /*: Option[File]*/ =>
  val dir: File = jh.getOrElse(null)    // unSome
  //
  val jfxJar = new File(dir, "/jre/lib/jfxrt.jar")
  if (!jfxJar.exists) {
    throw new RuntimeException( "JavaFX not detected (needs Java runtime 7u06 or later): "+ jfxJar.getPath )  // '.getPath' = full filename
  }
  Attributed.blank(jfxJar)
}
