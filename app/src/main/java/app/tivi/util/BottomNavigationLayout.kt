/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.tivi.util

import android.content.Context
import android.util.AttributeSet
import android.view.WindowInsets
import android.widget.FrameLayout

class BottomNavigationLayout(
    context: Context,
    attrs: AttributeSet?
) : FrameLayout(context, attrs) {

    private var bottomNavigationView: BottomNavigationView? = null


    override fun onApplyWindowInsets(insets: WindowInsets): WindowInsets {



        return insets.consumeSystemWindowInsets()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)


    }

    private fun findChildren() {

    }
}