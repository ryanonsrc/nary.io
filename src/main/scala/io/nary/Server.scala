package io.nary

import org.http4s.server.blaze.BlazeBuilder

object Server extends App {
  BlazeBuilder
    .bindHttp(8080, "0.0.0.0")
    .mountService(Application.service, "/")
    .run
    .awaitShutdown()
}
