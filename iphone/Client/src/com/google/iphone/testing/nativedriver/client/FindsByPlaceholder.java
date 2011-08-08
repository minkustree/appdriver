/*
Copyright 2011 NativeDriver committers
Copyright 2011 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.iphone.testing.nativedriver.client;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * An interface implemented by {@link org.openqa.selenium.SearchContext}s which
 * represents the ability to find elements by placeholder text. The methods on
 * this interface are used in the same way as the methods on the standard
 * {@code FindsBy...} interfaces, such as
 * {@link org.openqa.selenium.internal.FindsById}.
 *
 * @author Tomohiro Kaizu
 */
public interface FindsByPlaceholder {
  /**
   * The name of the find-by-placeholder strategy as used in the JSON protocol.
   */
  String USING_PLACEHOLDER = "placeholder";

  WebElement findElementByPlaceholder(String using);
  List<WebElement> findElementsByPlaceholder(String using);
}
