function isTriangle(a,b,c)
{
    var max = Math.max(a,b,c);
    var surface = a+b+c;
    return surface - max >max;
}