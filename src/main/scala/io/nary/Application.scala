package io.nary

import org.http4s.MediaType
import org.http4s.headers.`Content-Type`
import org.http4s.server._
import org.http4s.dsl._

object Application {
  val service = HttpService {
    case GET -> Root =>
      Ok(
        """
          | <html>
          |      <head>
          |        <title>nary.io | because n is better than n-1</title>
          |        <link href="http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300" rel="stylesheet" type="text/css"/>
          |      </head>
          |      <body>
          |        <p style="font-family: 'Open Sans Condensed', 'sans-serif'; font-size: x-large;"><strong>Ryan Delucchi</strong> /rahy-uhn del-oo k-ee/ <strong>n.</strong></p>
          |        <p style="font-family: 'Open Sans Condensed', 'sans-serif'; font-size: large;">
          |        The author of nary.io,
          |
          |        pure-functional programming ultraist and Scala craftsman residing in San Jose, California.
          |        A Principal Engineer, building core application services at Verizon.  He enjoys biking and can be a bit
          |        of a wine, beer, and cheese snob.  The same goes for his taste in music: which ranges from Baroque to
          |        Contemporary and excludes pretty much all popular music.
          |
          |        Organizer of the <a href="http://www.meetup.com/Bay-Burrito-Ballmer-Peak-Hackers/">South Bay Scala DrinkUp</a>
          |        </p>
          |      </body>
          |    </html>
        """.stripMargin).withContentType(Some(`Content-Type`(MediaType.`text/html`)))
  }
}
