package com.mirego.trikot.foundation.concurrent.dispatchQueue

actual class OperationDispatchQueue : JvmDispatchQueue(), DispatchQueue

@Deprecated("Streams subscription concurrency is now handled by a serial queue in PublishSubject")
actual class SerialSubscriptionDispatchQueue : JvmDispatchQueue(1), DispatchQueue
