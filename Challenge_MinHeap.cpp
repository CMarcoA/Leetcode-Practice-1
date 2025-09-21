#include <vector>
#include <stdexcept>
#include <iostream>

class MinHeap
{
private:
    std::vector<int> array;

public:
    // Heapify up
    // compare value with its parent's value
    // until when? if the child > parent, compare until it reaches the root
    void MinHeap::Heapify(int index)
    {
        // use the index as an anchor, keeps us in track on where / which values to compare
        // the actual values comes by array[index] / array [parentIndex]
        while (index > 0)
        {
            int parentIndex = (index - 1) / 2;
            if (array[index] < array[parentIndex])
            {
                std::swap(array[index], array[parentIndex]);
                index = parentIndex;
            }
            else
            {
                break;
            }
        }
    }

    //
    void MinHeap::insert(int x)
    {
        array.push_back(x);
        Heapify((int)array.size() - 1);
    }

    //
    int MinHeap::peek() const
    {
        if (array.empty())
            throw std::runtime_error("heap is empty");
        return array[0];
    }
};