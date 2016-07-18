package io.nary

import org.http4s.server.blaze.BlazeBuilder

object Server extends App {
  BlazeBuilder
    .bindHttp(sys.env("PORT").toInt, "0.0.0.0")
    .mountService(Application.service, "/")
    .run
    .awaitShutdown()
}
