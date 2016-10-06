/*
 * The MIT License
 *
 * Copyright (c) 2013-2016 reark project contributors
 *
 * https://github.com/reark/reark/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.reark.rxgithubapp.shared.pojo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import io.reark.reark.utils.Preconditions;

public class GitHubOwner {

    @Nullable
    @SerializedName("avatar_url")
    final private String avatarUrl;

    @SuppressWarnings("NullableProblems")
    public GitHubOwner(@NonNull final String avatarUrl) {
        Preconditions.checkNotNull(avatarUrl, "Avatar cannot be null");

        this.avatarUrl = avatarUrl;
    }

    public GitHubOwner() {
        this("");
    }

    @NonNull
    public String getAvatarUrl() {
        return avatarUrl == null ? "" : avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitHubOwner)) {
            return false;
        }

        GitHubOwner that = (GitHubOwner) o;

        return !(avatarUrl != null ? !avatarUrl.equals(that.avatarUrl) : that.avatarUrl != null);

    }

    @Override
    public int hashCode() {
        return avatarUrl != null ? avatarUrl.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GitHubOwner{");
        sb.append("avatarUrl='").append(avatarUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
