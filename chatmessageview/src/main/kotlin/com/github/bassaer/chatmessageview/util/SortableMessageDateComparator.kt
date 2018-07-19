package com.github.bassaer.chatmessageview.util

import com.github.bassaer.chatmessageview.model.Message
import com.github.bassaer.chatmessageview.model.SortableMessage
import java.util.*

class SortableMessageDateComparator : Comparator<SortableMessage> {
    override fun compare(first: SortableMessage, second: SortableMessage): Int {
        if (first.sendTime.before(second.sendTime)) {
            return -1
        }
        return if (first.sendTime.after(second.sendTime)) {
            1
        } else 0
    }
}
