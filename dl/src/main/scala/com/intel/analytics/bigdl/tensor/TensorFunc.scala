/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.analytics.bigdl.tensor

trait TensorFunc2[@specialized(Float, Double) T] {
  self =>
  def apply(v1: Array[T], v2: Int): Unit

  override def toString(): String = "<TensorFunction2>"
}

trait TensorFunc4[@specialized(Float, Double) T] {
  self =>
  def apply(v1: Array[T], v2: Int, v3: Array[T], v4: Int): Unit

  override def toString(): String = "<TensorFunction4>"
}

trait TensorFunc6[@specialized(Float, Double) T] {
  self =>
  def apply(v1: Array[T], v2: Int, v3: Array[T], v4: Int,
    v5: Array[T], v6: Int): Unit

  override def toString(): String = "<TensorFunction6>"
}