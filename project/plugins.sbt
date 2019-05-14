resolvers += Resolver.bintrayRepo("ktosopl", "sbt-plugins/sbt-jcstress")

addSbtPlugin("pl.project13.scala"                % "sbt-jmh"                   % "0.3.6")
addSbtPlugin("pl.project13.scala"                % "sbt-jcstress"              % "0.2.0")
addSbtPlugin("com.dwijnand"                      % "sbt-travisci"              % "1.2.0")
addSbtPlugin("org.scala-js"                      % "sbt-scalajs"               % "0.6.27")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"  % "0.6.0")
addSbtPlugin("com.47deg"                         % "sbt-microsites"            % "0.9.0" exclude ("org.scalameta", "mdoc"))
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"              % "2.0.0")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"             % "0.9.0")
addSbtPlugin("org.scoverage"                     % "sbt-scoverage"             % "1.5.1")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"          % "3.0.0")
addSbtPlugin("com.geirsson"                      % "sbt-ci-release"            % "1.2.1")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies" % "0.2.8")
addSbtPlugin("de.heikoseeberger"                 % "sbt-header"                % "5.2.0")
addSbtPlugin("ch.epfl.lamp"                      % "sbt-dotty"                 % "0.3.1")
addSbtPlugin("org.scalameta"                     % "sbt-mdoc"                  % "1.2.7")