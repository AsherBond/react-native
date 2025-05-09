/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react

@Deprecated(
    message = "Use BaseReactPackage instead",
    replaceWith = ReplaceWith(expression = "BaseReactPackage"))
public abstract class TurboReactPackage : BaseReactPackage()
