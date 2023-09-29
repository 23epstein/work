#include <iostream>
using namespace std;
class complex
{
public:
    int real, img;
};
int main()
{
    complex a, b, c, x, y;
    cout << "Enter a and b where a + ib is the first complex number.";
    cout << "\na = ";
    cin >> a.real;
    cout << "b = ";
    cin >> a.img;
    cout << "Enter c and d where c + id is the second complex number.";
    cout << "\nc = ";
    cin >> b.real;
    cout << "d = ";
    cin >> b.img;
    // addition of two complex numbers
    c.real = a.real + b.real;
    c.img = a.img + b.img;
    if (c.img >= 0)
        cout << "Sum of two complex numbers = " << c.real << " + " << c.img << "i";
    else
        cout << "Sum of two complex numbers = " << c.real << " " << c.img << "i";
    // differnce of two complex numbers
    y.real = a.real - b.real;
    y.img = a.img - b.img;
    if (y.img >= 0)
        cout << "\n" << "Differnce of two complex numbers = " << y.real << " + " << y.img << "i";
    else
        cout << "\n" << "Differnce of two complex numbers = " << y.real << " " << y.img << "i";
    /* product of two complex numbers 
       formula for product of two complex is --> (a + ib)(c + id) = (ac - bd) + i(ad + bc) */
    x.real = (a.real * b.real - a.img * b.img);
    x.img = (a.real * b.img + a.img*b.real);
    if (x.img >= 0)
        cout << "\n" << "Product of two complex numbers = " << x.real << " + " << x.img << "i";
    else
        cout << "\n" << "Product of two complex numbers = " << x.real << " " << x.img << "i";
    return 0;
}
