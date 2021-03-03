/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

data class Pet(
    val name: String,
    val age: Int,
    val sex: String,
    val picture: Int,
    val bio: String
)

/**
 * Sample data for pets.
 *
 * All images sourced from https://thiscatdoesnotexist.com/
 */
val pets = listOf(
    Pet("Bobby", 3, "Male", R.drawable.cat1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Jenny", 2, "Female", R.drawable.cat2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Brick", 8, "Male", R.drawable.cat3, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Cupcake", 12, "Female", R.drawable.cat4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Angel", 1, "Female", R.drawable.cat5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Cornbread", 1, "Male", R.drawable.cat6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Missy", 2, "Female", R.drawable.cat7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Gonzo", 4, "Male", R.drawable.cat8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Thanos", 2, "Male", R.drawable.cat9, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
    Pet("Ginger", 3, "Female", R.drawable.cat10, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pulvinar vulputate lacinia. Etiam quis justo at ante porttitor suscipit luctus et nisl. Integer dignissim, diam nec fringilla bibendum, velit libero convallis orci, mollis auctor ipsum velit ut ex. Vivamus sodales, nisi id varius tristique, odio tellus finibus purus, ac hendrerit lectus arcu ultrices orci. Nullam tellus ex, bibendum eget turpis ac, blandit molestie ipsum. Proin tempus mattis vulputate."),
)
