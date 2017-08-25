/*
 *     Food Inspector - Choose well to eat better
 *     Copyright (C) 2016  Frédéric Letellier
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kumar.prince.foodneturationchecker.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 *  Created by prince on 25/8/17.
 * */
public class FC_Product {

    private long mId;
    private boolean mParsed;
    private boolean mBookmarked;

    public FC_Product(long mId, boolean mParsed, boolean mBookmarked) {
        this.mId = mId;
        this.mParsed = mParsed;
        this.mBookmarked = mBookmarked;
    }

    public long getmId() {
        return mId;
    }

    public boolean ismParsed() {
        return mParsed;
    }

    public boolean ismBookmarked() {
        return mBookmarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FC_Product)) return false;

        FC_Product that = (FC_Product) o;

        if (getmId() != that.getmId()) return false;
        if (ismParsed() != that.ismParsed()) return false;
        return ismBookmarked() == that.ismBookmarked();
    }

    @Override
    public int hashCode() {
        int result = (int) (getmId() ^ (getmId() >>> 32));
        result = 31 * result + (ismParsed() ? 1 : 0);
        result = 31 * result + (ismBookmarked() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FC_Product{" +
                "mId=" + mId +
                ", mParsed=" + mParsed +
                ", mBookmarked=" + mBookmarked +
                '}';
    }
}