package services

import java.util.concurrent.atomic.AtomicInteger

trait Timer {
  def incrementAndGet(): Int
}

class TimerImpl extends Timer{

  val count = new AtomicInteger(1)

  override def incrementAndGet() =
    count.incrementAndGet()
}
